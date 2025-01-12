window.onload = function () {
    listarDivisas();
};

const listarDivisas = async () => {
    try {
        const peticion = await fetch("http://localhost:9001/getAllDivisa", {
            method: "GET",
            headers: {
                "Accept": "application/json",
                "Content-Type": "application/json",
            },
        });

        if (!peticion.ok) {
            throw new Error(`Error en la solicitud: ${peticion.status}`);
        }

        const allDivisas = await peticion.json();
        let contenidoOptions = "";

        for (let divisa of allDivisas) {
            contenidoOptions += `<option value="${divisa.name}">${divisa.name}</option>`;

        }

        document.querySelector("#from-currency").innerHTML = contenidoOptions;
        document.querySelector("#to-currency").innerHTML += contenidoOptions;
    } catch (error) {
        console.error("Error al listar divisas:", error);
    }
};
const divisaRates = {
    USD: 1,
    EUR: 0.85,
    ARS: 300,
    AUD: 1.3,
    JPY: 110,
    GBP: 0.75
};

document.querySelector("#converter-form").addEventListener("submit", (e) => {
    e.preventDefault();

    const amount = parseFloat(document.querySelector("#amount").value);
    const fromCurrency = document.querySelector("#from-currency").value;
    const toCurrency = document.querySelector("#to-currency").value;

    if (isNaN(amount) || !fromCurrency || !toCurrency) {
        document.querySelector("#result").innerText = "Por favor, ingrese todos los campos correctamente.";
        return;
    }
    console.log(divisaRates[fromCurrency]);
    console.log(divisaRates[toCurrency]);
    console.log(amount);
    console.log(fromCurrency);
    console.log(toCurrency);

    //Verifica que exista un objeto con el valor fromCurrency (que en este caso será el nombre de la  divisa), Si lo encuentra retornaría su valor sino un undefined que debemos atrapar)
    if (!divisaRates[fromCurrency] || !divisaRates[toCurrency]) {
        document.querySelector("#result").innerText = "Divisa no disponible o valor no encontrado";
        return;
    }

    // Convertir `fromCurrency` a USD
    const mountInUSD = amount / divisaRates[fromCurrency];

    // Convertir de USD a `toCurrency`
    const convertedAmount = (mountInUSD * divisaRates[toCurrency]).toFixed(2);
    //Ladivisa ioniciar a la divisa final
    document.querySelector("#result").innerText = `${amount} ${fromCurrency} == ${convertedAmount} ${toCurrency}.`
});
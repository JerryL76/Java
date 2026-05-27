let companies;

async function init() {
  let link = "https://turbo-space-cod-pjwjgwrx7ggp3rv56-8500.app.github.dev/";
  let route = "companies";

  let info = await fetch(link + route);
  companies = await info.json();

  console.log(companies);
  displayCompanies(companies);
}

function displayCompanies(data) {
  let output = "";

  for (let i = 1; i < data.length; i++) {
    output += `
      <div class="card">
        <h3>${data[i].field2}</h3>
        <p><strong>Industry:</strong> ${data[i].field3}</p>
        <p><strong>Net Worth:</strong> ${data[i].field4}</p>
        <p><strong>Headquarters:</strong> ${data[i].field5}</p>
      </div>
    `;
  }

  document.getElementById("output").innerHTML = output;
}

init();
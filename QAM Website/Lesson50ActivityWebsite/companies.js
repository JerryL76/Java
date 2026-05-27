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

  for (let i = 0; i < data.length; i++) {
    output += `
      <div class="card">
        <h3>${data[i].company_name}</h3>
        <p>Industry: ${data[i].industry}</p>
        <p>Location: ${data[i].city}</p>
      </div>
    `;
  }

  document.getElementById("output").innerHTML = output;
}

init();
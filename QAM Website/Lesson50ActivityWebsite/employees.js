async function init() {

  let link = "https://turbo-space-cod-pjwjgwrx7ggp3rv56-8500.app.github.dev/"; 
  let route = "employees";

  let info = await fetch(link + route);
  employees = await info.json();

  console.log(employees);
  displayEmployees(employees);
}

function displayEmployees(data) {
  let output = "";


  for (let i = 1; i < data.length; i++) {
    output += `
      <div class="card">
        <h3>${data[i].field2}</h3>
        <p><strong>Department:</strong> ${data[i].field3}</p>
        <p><strong>Email:</strong> ${data[i].field4}</p>
        <p><strong>Location:</strong> ${data[i].field5}</p>
      </div>
    `;
  }

  document.getElementById("output").innerHTML = output;
}

init();

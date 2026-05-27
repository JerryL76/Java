let employees;

async function init() {
  let link = "https://turbo-space-cod-pjwjgwrx7ggp3rv56-8500.app.github.dev/employees";

  try {
    let response = await fetch(link);
    employees = await response.json();
    console.log("Data loaded:", employees);
    displayEmployees(employees);
  } catch (error) {
    console.error("Error fetching data:", error);
  }
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
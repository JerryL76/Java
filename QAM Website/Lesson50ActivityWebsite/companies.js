async function init() {
  let link = "https://turbo-space-cod-pjwjgwrx7ggp3rv56-8500.app.github.dev/companies";
  let info = await fetch(link);
  let data = await info.json();
  displayCompanies(data);
}

function displayCompanies(data) {
  let output = "";
  for (let i = 1; i < data.length; i++) {
    output += `
      <div class="card" onclick="flipCard(this)">
        <div class="card-inner">
          <div class="card-front">
            <h3>${data[i].field2}</h3>
            <p style="font-size: 0.8rem; color: #004085;">Click to flip</p>
          </div>
          <div class="card-back">
            <p><strong>Location:</strong> ${data[i].field3}</p>
            <p><strong>Industry:</strong> ${data[i].field4}</p>
            <p><strong>Net Worth:</strong> ${data[i].field5}</p>
          </div>
        </div>
      </div>`;
  }
  document.getElementById("output").innerHTML = output;
}


function flipCard(cardElement) {
  cardElement.classList.toggle('is-flipped');
}

init();

function filterCompanies() {
  let input = document.getElementById("companySearch").value.toLowerCase();
  let cards = document.getElementsByClassName("card");

  for (let i = 0; i < cards.length; i++) {
    let cardText = cards[i].innerText.toLowerCase();
    
    if (cardText.includes(input)) {
      cards[i].style.display = "block";
    } else {
      cards[i].style.display = "none";
    }
  }
}
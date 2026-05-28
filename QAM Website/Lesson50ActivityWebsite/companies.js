async function init() {
  let link = "https://turbo-space-cod-pjwjgwrx7ggp3rv56-8500.app.github.dev/companies";
  let info = await fetch(link);
  let data = await info.json();
  displayCompanies(data);
}


function getIcon(index) {
  const iconNames = [
    'cpu', 'cloud', 'shield-check', 'box', 'bar-chart-3', 
    'network', 'infinity', 'mountain', 'layout-grid', 'shield', 
    'filter', 'link', 'database', 'building-2', 'layers', 
    'waves', 'circuit-board', 'brain-circuit', 'code-2', 'eye', 
    'globe', 'binary', 'cloud-cog', 'pyramid', 'pie-chart', 
    'shave-ice', 'lightbulb', 'trending-up', 'star', 'activity'
  ];
  
  let name = iconNames[index] || 'building';
  return `https://unpkg.com/lucide-static@latest/icons/${name}.svg`;
}

function displayCompanies(data) {
  let output = "";
  

  for (let i = 1; i < data.length; i++) {
    let logoUrl = getIcon(i - 1);

    output += `
      <div class="card" onclick="flipCard(this)">
        <div class="card-inner">
          <div class="card-front">
            <img src="${logoUrl}" alt="logo" 
                 style="width: 50px; height: 50px; margin-bottom: 15px; 
                        filter: invert(24%) sepia(91%) saturate(2203%) hue-rotate(198%) brightness(94%) contrast(101%);">
            
            <h3>${data[i].field2}</h3>
            <p style="font-size: 0.8rem; color: #004085;">Click to flip</p>
          </div>
          <div class="card-back">
            <p><strong>Location:</strong> ${data[i].field5}</p>
            <p><strong>Industry:</strong> ${data[i].field3}</p>
            <p><strong>Net Worth:</strong> ${data[i].field4}</p>
          </div>
        </div>
      </div>`;
  }
  document.getElementById("output").innerHTML = output;
}

function flipCard(cardElement) {
  cardElement.classList.toggle('is-flipped');
}

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


init();
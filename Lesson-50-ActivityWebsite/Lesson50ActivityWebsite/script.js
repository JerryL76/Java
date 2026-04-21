let tracks;

async function init() {
  let link = "https://turbo-space-cod-pjwjgwrx7ggp3rv56-8500.app.github.dev/";
  let route = "tracks";

  let info = await fetch(link + route);
  tracks = await info.json();

  console.log(tracks);
  displayTracks(tracks);
}

function displayTracks(songs) {
  let output = "";

  for (let i = 0; i < songs.length; i++) {
    output += `
      <div class="card">
        <h3>Song Name: ${songs[i].Name}</h3>
        <p>ID: ${songs[i].TrackId}</p>
        <p>Price: $${songs[i].UnitPrice}</p>
      </div>
    `;
  }

  document.getElementById("output").innerHTML = output;
}
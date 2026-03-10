const MOCK_API_URL = 'https://49fbea8b-c177-4898-9741-f842fc3016b0.mock.pstmn.io/places';

window.onload = function() {
    fetch(MOCK_API_URL)
    .then(response => response.json())
    .then(data => {
        console.log("데이터 가져오기 성공", data);
        renderCards(data);
    })
    .catch(error => console.error("에러 발생: ", error));
}

function renderCards(places) {
    const container = document.getElementById('restaurant-list');
    container.innerHTML = '';

    places.forEach(place => {
        const stars = '★'.repeat(place.rating);
        const cardHTML = `
            <div class="card"> <div class="card-body">
                        <h3 class="card-title">${place.name}</h3>
                        <h6 class="card-text"><b>분류:</b>${place.category}</h6>
                        <p class="card-text"><b>주소:</b>${place.address}</p>
                        <p class="card-text"><b>전화:</b>${place.call}</p>
                        <p class="card-text">${stars}</p>
                    </div>
                </div>
           `;
        container.insertAdjacentHTML('beforeend', cardHTML);
    })
}
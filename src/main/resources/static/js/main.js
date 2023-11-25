// main.js
document.addEventListener("DOMContentLoaded", function () {
    const squares = document.querySelectorAll('.square');
    const modal = document.getElementById("bookingModal");
    const closeModal = document.getElementsByClassName("close")[0];
    let selectedSquare = null;

    squares.forEach(square => {
        square.addEventListener('click', function () {
            modal.style.display = "block";
            selectedSquare = square;
        });
    });

    closeModal.onclick = function () {
        modal.style.display = "none";
    }

    window.onclick = function (event) {
        if (event.target == modal) {
            modal.style.display = "none";
        }
    }

    document.getElementById("bookButton").addEventListener("click", function () {
        if (selectedSquare) {
            selectedSquare.style.backgroundColor = 'green';
        }
        modal.style.display = "none";
    });
});

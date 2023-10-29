const form = document.getElementById("survey-form");
const popup = document.getElementById("popup");
const popupContent = document.getElementById("popup-content");
const closePopup = document.getElementById("close-popup");
const resetButton = document.getElementById("reset-button");

form.addEventListener("submit", function (event) {
  event.preventDefault();
  // Collect form data
  const formData = new FormData(form);
  let popupHTML = "<ul>";
  for (const [key, value] of formData.entries()) {
    popupHTML += `<li><strong>${key}:</strong> ${value}</li>`;
  }
  popupHTML += "</ul>";
  popupContent.innerHTML = popupHTML;
  popup.style.display = "block";
});

closePopup.addEventListener("click", function () {
  popup.style.display = "none";
  form.reset();
});

resetButton.addEventListener("click", function () {
  form.reset();
});

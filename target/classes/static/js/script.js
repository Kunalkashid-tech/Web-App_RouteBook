document.addEventListener('DOMContentLoaded', function(){
	const selectedLanguageLink = document.getElementById('selectedLanguage');
	const languageList = document.getElementById('languageList');
	
	languageList.addEventListener('click', function(event){
		event.preventDefault();
		const selectedLang = event.target.getAttribute('data-lang');
		
		selectedLanguageLink.textContent = selectedLang.charAt(0).toUpperCase() + selectedLang.slice(1);
	    
	    console.log('Selected Language :', selectedLang);
	
	});
});
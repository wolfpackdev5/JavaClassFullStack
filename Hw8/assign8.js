

document.getElementById("button").addEventListener("click", tellAStory);



function tellAStory() {
   console.log("did it");
   document.getElementById("story-container").style.display = "block";
   var name = document.getElementById("name").value;
   var object = document.getElementById("object").value;
   var adjective = document.getElementById("adjective").value;
   var adverb = document.getElementById("adverb").value;

   document.getElementById("story-container").innerHTML = document.getElementById("story-container").innerHTML.replace(/name/g, name);
   document.getElementById("story-container").innerHTML = document.getElementById("story-container").innerHTML.replace(/object/g, object);
   document.getElementById("story-container").innerHTML = document.getElementById("story-container").innerHTML.replace(/adjective/g, adjective);
   document.getElementById("story-container").innerHTML = document.getElementById("story-container").innerHTML.replace(/adverb/g, adverb);

   if(document.getElementById("name").value == "") {
      alert("name is empty so the story doesn't make sense");
   }
   if(document.getElementById("object").value == "") {
      alert("object is empty so the story doesn't make sense");
   }
   if(document.getElementById("adjective").value == "") {
      alert("adjective is empty so the story doesn't make sense");
   }
   if(document.getElementById("adverb").value == "") {
      alert("adverb is empty so the story doesn't make sense");
   }
}

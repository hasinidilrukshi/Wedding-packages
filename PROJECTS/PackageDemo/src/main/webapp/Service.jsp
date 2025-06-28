<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Packages</title>
 <div id="navbar"></div>
	<script>
    fetch('navbar.jsp')
        .then(response => response.text())
        .then(data => {
            document.getElementById('navbar').innerHTML = data;
        });
	</script>
    </header>
    
    <br>
    <br>
<style>

     body{
 
        background-image: url('images/K.jpg');
        background-size: cover; 
        background-position: center;
        
     }
     
      .container {
        width: 80%;
        margin: 0 auto;
        padding: 20px;
        font-family: Arial, sans-serif;
        
    }
    
    .package {
        margin-bottom: 20px;
        padding: 20px;
        background-color: #4d4d4d;
        border: 1px solid #ddd;
        border-radius: 5px;
        box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        justify-content: flex-start; 
        text-align: left;  
        padding-left: 20px;
    }
    
    .package__content {
         max-width: 60%;
          
    }
    
    .package__header {
        display: flex;
        align-items: center;
        justify-content: space-between;
        margin-bottom: 15px;
    }
    
    .package__name {
        font-size: 1.5em;
        color:#FFFAF0;
    }
    
    .package__body {
        font-size: 1em;
        color:#FFFAF0;
    }
    
    img {
        border: 2px solid #000;
        width: 200px;
        height: 200px;
    }
    
     button {
        padding: 20px 30px;
        background-color:#C4A484;
        color: white;
        border-color: white;
        border-radius: 10px;
        cursor: pointer;
    }
    
    button:hover {
        background-color:#A9846A;
    } 
</style>
</head>
<body>
<div class="container mt-3">

    <!-- Wedding Package -->
    <div class="package">
        <div class="package__item">
            <div class="package__header">
                <div class="package__name"><b>Wedding Package</b></div>
                <div id="imageContainer1"></div>
            </div>
            <div class="package__body">
                <b>"Make your dream wedding a reality with our all-inclusive wedding package. <br>
                    From elegant decorations, custom floral arrangements, and gourmet catering to entertainment,<br>
                    venue setup, and guest coordination, we handle every detail to create an unforgettable experience."</b>
            </div>
        </div>
    </div>

    <!-- Birthday Package -->
    <div class="package">
        <div class="package__item">
            <div class="package__header">
                <div class="package__name"><b>Birthday Package</b></div>
                <div id="imageContainer2"></div>
            </div>
            <div class="package__body">
               <b>"Celebrate your birthday in style with our customized birthday package <br>
                   designed to create joyful and unforgettable memories. We provide vibrant decorations, <br>
                   delicious cakes, catering, entertainment, and fun activities."</b>
            </div>
        </div>
    </div>

    <!-- Conference Package -->
    <div class="package">
        <div class="package__item">
            <div class="package__header">
                <div class="package__name"><b>Conference Package</b></div>
                <div id="imageContainer3"></div>
            </div>
            <div class="package__body">
                <b>"Host a seamless and professional conference with our comprehensive conference package. <br>
                    We provide modern venues equipped with high-tech audio-visual systems, Wi-Fi, event planning, <br>
                    and catering services."</b>
            </div>
        </div>
    </div>

    <!-- Corporate Package -->
    <div class="package">
        <div class="package__item">
            <div class="package__header">
                <div class="package__name"><b>Corporate Package</b></div>
                <div id="imageContainer4"></div>
            </div>
            <div class="package__body">
                <b>"Elevate your corporate events with our premium corporate package designed for meetings, <br>
                    product launches, or award ceremonies. We offer venue setup, audiovisual equipment, <br>
                    customized catering, and professional event coordination."</b>
            </div>
        </div>
    </div>

    <br>
    <button type="submit">Create</button>
</div>

<script>
// Adding images dynamically to the respective package sections
var img1 = document.createElement("img");
img1.src = "images/A.jpg";
document.getElementById("imageContainer1").appendChild(img1);

var img2 = document.createElement("img");
img2.src = "images/B.jpg";
document.getElementById("imageContainer2").appendChild(img2);

var img3 = document.createElement("img");
img3.src = "images/C.jpg";
document.getElementById("imageContainer3").appendChild(img3);

var img4 = document.createElement("img");
img4.src = "images/D.jpg";
document.getElementById("imageContainer4").appendChild(img4);
</script>

 <br>
      <br>
      
      <div id="footer"></div>

    <script>
        // Load the footer HTML content
        fetch('footer.jsp')
            .then(response => response.text())
            .then(data => {
                document.getElementById('footer').innerHTML = data;
            })
            .catch(error => console.error('Error loading footer:', error));
    </script>

</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<style>

body{
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        min-height:  100vh;
        line-height: 1.5;
        flex-direction: column;
        background-image: url('images/K.jpg');
        background-size: cover; 
        background-position: center;
        
    }

    form {
        background-color: #FFFFFF;
        border-radius: 15px;
        box-shadow: 0 0 20px
            rgba(0, 0, 0, 0.2);
        padding: 10px 20px;
        width: 500px;
        text-align: center;
        transition: transform 0.2s;
         
    }

    .form h2 {
        color: #161816;
        margin-bottom: 20px;
        text-align: center;
    }
    h1 {
        color: #6d6e6d;
    }
    
    label {
        display: block;
        width: 100%;
        margin-top: 10px;
        margin-bottom: 5px;
        text-align: left;
        color: #555;
        font-weight: bold;
    }
    
    
    input {
        display: white;
        width: 100%;
        margin-bottom: 15px;
        padding: 10px;
        box-sizing: border-box;
        border: 1px solid #654321;
        border-radius: 5px;
    }
    

    button {             
    padding: 8px;
    border-radius: 8px;
    margin-top: 8px;
    margin-bottom: 8px;
    border: none;
    color:white;
    cursor: pointer;
    background-color: #C4A484; 
    width: 75%;
    font-size: 16px;
    transition: background-color 0.3s ease;
}
   button:hover {
    background-color: #A9846A; 
} 
    .wrap{
        display: flex;
        justify-content: center;
        align-items: center;
    }
    
    table {
    width: 40%;
    margin: 20px auto;
    border-collapse: collapse;
    background-color:#E0CDA9;
    border-radius: 8px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

 .table h2 {
        color: #FFFFFF;
        margin-bottom: 20px;
        text-align: center;
    }
    
th, td {
    padding: 8px;
    text-align: center;
    border-bottom: 1px solid #654321;
}

th {
    background-color: #B98663;
    color: white;
}

tr:hover {
    background-color: #708090;
}


#searchInput {
    width: 40%;
    padding: 8px;
    margin: 20px 0;
    border: 1px solid #654321;
    border-radius: 5px;
    font-size: 16px;
}


@media (max-width: 768px) {
    form {
        width:75%;
    }

    table {
        width: 50%;
    }
}


</style>
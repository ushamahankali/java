<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
      <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
<!--  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/skeleton/2.0.4/skeleton.css" />
 -->
<link rel="stylesheet" href="/resources/css.style.css">
  <!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
    
<script src="https://code.jquery.com/jquery-1.10.2.js" type="text/javascript"></script>

<title>FreshDesk Index</title>
<link rel="stylesheet" href="signin.css" type="text/css">
<style>

.image-div{
   background-image: url(http://partenaires.esnault-geometre.fr/dossiers/webman/login_background.jpg);
  background-repeat: no-repeat;
  background-size: cover;
  padding: 25px;
  margin: 25px;
}

 h1, h2 {
    text-align: center;
    font-weight: 100;
    margin: 1rem 0;
  }
  
  h1 {
    font-size:2rem;
  }
  
  h2 {
    font-size:1.5rem;
  }
  
  ul {
    max-width: 18rem;
    text-align: left;
    margin: 1rem auto;
  }
  
  li {
    margin: 0.5rem 0
  }
  
  .top {
    margin-top: 10vw;
  }
  
  .bottom {
    position:fixed;
    bottom:0;
    left:0;
    right:0;
    background: linear-gradient(to bottom, rgba(0,0,0,0.3) 0%,rgba(0,0,0,0.6) 100%);
  }
  
  [class*="social_lnk"] {
    position: relative;
    display: inline-block;
    padding: .125em;
    border-radius: 50%;
    text-decoration: none;
    background-color: #3B2D4A;
    width: 4rem;
    height: 4rem;
    outline: 0 solid;
    box-shadow: 0 .25em .25em rgba(0, 0, 0, .3);
    transition: all .3s ease-out;
    animation: social-hoverOff .3s ease-out;
  }
  
  [class*="social_lnk"]:hover,
  [class*="social_lnk"]:focus {
    background-color: currentColor;
    outline: 0 solid;
    transform: scale(1.12);
    box-shadow: 0 .5em .5em rgba(0, 0, 0, .4);
    animation: social-hoverOn .3s ease-out;
  }
  
  [class*="social_lnk"].-clicked {
    animation: pressed-social .3s ease-out;
  }
  
  @keyframes pressed-social {
    0% {
      transform: scale(1.1);
    }
    
    50% {
      transform: scale(.8);
      background-color: #3B2D4A;
      box-shadow: 0 .5em .5em rgba(0, 0, 0, 0);
    }
    
    100% {
      transform: scale(1.2);
    }
    
  }
  
  
  /* Individual social links */
  
  .social_lnk-twitter {
    color: #37A7DF;
    background-image: url("data:image/svg+xml;charset=utf8,%3Csvg viewBox='0 0 48 48' xmlns='http://www.w3.org/2000/svg'%3E%3Cpath fill='%23fff' d='M15.2 31.44c2.4 0 4.47-.74 6.1-2.08-2.22 0-4-1.5-4.6-3.43.3.15.6.15.9.15.44 0 .88 0 1.33-.15-2.23-.44-3.87-2.38-3.87-4.76.75.3 1.5.6 2.23.6-1.36-.9-2.25-2.38-2.25-4.02 0-.9.15-1.8.6-2.53 2.38 2.98 6.1 4.9 10.12 5.06-.15-.3-.15-.6-.15-1.04 0-2.68 2.23-4.9 4.9-4.9 1.35 0 2.7.58 3.58 1.47 1.2-.27 2.24-.57 3.14-1.17-.3 1.05-1.05 2.1-2.1 2.68 1.05-.14 1.95-.3 2.84-.73-.6 1.04-1.5 1.78-2.53 2.53v.58c0 6.55-4.9 14-14 14-2.67 0-5.2-.9-7.43-2.24h1.2z'/%3E%3C/svg%3E");
  }
  
  .social_lnk-linkedin {
    color: #007BB5;
    background-image: url("data:image/svg+xml;charset=utf8,%3Csvg viewBox='0 0 48 48' xmlns='http://www.w3.org/2000/svg'%3E%3Cpath fill='%23fff' d='M18.37 19.97V36h-5V19.96h5zm7.96 2.2c.66-1.27 2.3-2.6 4.7-2.6 5.05 0 5.98 3.32 5.98 7.64V36h-4.96v-7.8c0-1.86-.03-4.25-2.58-4.25-2.6 0-3 2.03-3 4.12V36H21.5V19.96h4.76v2.2h.07zM15.88 12c1.6 0 2.88 1.3 2.88 2.9 0 1.6-1.3 2.88-2.88 2.88-1.6 0-2.9-1.3-2.9-2.88 0-1.6 1.3-2.9 2.9-2.9z'/%3E%3C/svg%3E");
  }
  
  .social_lnk-codepen {
    color: #000;
    background-image: url("data:image/svg+xml;charset=utf8,%3Csvg viewBox='0 0 48 48' xmlns='http://www.w3.org/2000/svg'%3E%3Cpath fill='%23fff' d='M24.6 8.5c-.3-.4-.8-.5-1.6 0L8.7 18c-.4 0-.7.4-.7 1.2v9.5c0 .7.3 1 .7 1.3L23 39.6c.7.3 1.3.3 1.6 0L39.3 30c.5-.3.7-.8.7-1.3v-9.5c0-1-.7-1.2-.7-1.2L24.6 8.5zm-2 27.6L12 29l4.7-3.2 6 4.2v6zm2.7 0v-6l6-4 4.7 3-10.5 7zM24 27l-4.8-3 4.8-3.2 4.8 3.2-4.8 3zm-13.3-5.3l3.7 2.3-3.7 2.2v-4.5zm26.6 4.5L33.6 24l3.7-2.3v4.5zm-12-14.4L36 19.2l-4.7 3.2-6-4v-6.6zm-2.6 0v6.4l-6 4.2-4.8-3.2L22.2 12v-.2z'/%3E%3C/svg%3E");
  }
  
  .social_lnk-googleplus {
    color: #dd4b39;
    background-image: url("data:image/svg+xml;charset=utf8,%3Csvg viewBox='0 0 48 48' xmlns='http://www.w3.org/2000/svg'%3E%3Cpath fill='%23fff' d='M8.04 23.47c.1-5.5 5.16-10.33 10.66-10.15 2.64-.12 5.12 1.03 7.14 2.64-.86.98-1.75 1.92-2.7 2.8-2.43-1.67-5.9-2.15-8.32-.2-3.47 2.4-3.63 8.06-.3 10.65 3.26 3 9.4 1.5 10.3-3-2.03 0-4.07 0-6.1-.03-.02-1.2-.02-2.4-.02-3.63h10.22c.2 2.87-.17 5.9-1.93 8.27-2.7 3.74-8 4.84-12.2 3.24S7.62 28 8 23.5zm25.82-4.1h3.04c0 1 0 2.04.02 3.06 1.02 0 2.04 0 3.05.02v3.04h-3.05c0 1 0 2-.02 3h-3.04c0-1 0-2.03-.02-3.04-1.02 0-2.04 0-3.05-.03V22.4l3-.02v-3.03z'/%3E%3C/svg%3E");
  }
  
  .social_lnk-facebook {
    color: #3C5193;
    background-image: url("data:image/svg+xml;charset=utf8,%3Csvg viewBox='0 0 48 48' xmlns='http://www.w3.org/2000/svg'%3E%3Cpath fill='%23fff' d='M19.6 15.4c0-1.4 0-3.6 1-5C21.8 9 23.2 8 25.8 8c4.2 0 6 .6 6 .6l-.8 4.8s-1.3-.4-2.5-.4c-1.3 0-2.5.4-2.5 1.8v3.8h5.2l-.4 4.8h-5V40h-6.2V23.4h-3.4v-4.8h3.4v-3.2z'/%3E%3C/svg%3E");
  }
  
  [class*="social_lnk"] span {
    display: none;
  }
  
  
  /* Layout */
  
  .social_list {
    list-style: none;
    display: flex;
    justify-content: space-around;
    padding: 0;
    margin: 2rem auto;
    max-width: 34rem;
  }
  
  .social_list li {
    flex: 1 1 0;
    text-align: center;
  }
  
  
  
  [class*="social_lnk"]:hover::before,
  [class*="social_lnk"]:focus::before {
    opacity: 1;
    transform: translate(-50%, -70%) scale(1);
  }
  
  [class*="social_lnk"].-clicked::before {
    /* Couldn't see a use but you may */
  }
  
  .smaller {
    text-align: center;
    background-color: rgba(0,0,0,0.5);
  }
  
  .smaller a {
    color: #fff;
    padding: 1rem;
    display: inline-block;
  }
  
</style>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <a class="navbar-brand" href="index">FreshDesk Next Gen</a>

  <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
      <li class="nav-item active">
       <a class="nav-link" href="home">Home</a>
      </li>
  	 <li class="nav-item active">
       <a class="nav-link" href="ticket">Ticket</a>
     </li>
     <li class="nav-item active">
       <a class="nav-link" href="signin">Sign in</a>
     </li>
     <li class="nav-item active">
       <a class="nav-link" href="signup">Sign up</a>
     </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>
<div class="image-div"></div>
<br>

 <div class="container" align="center">
    <h2>Chuck Norris Joke Generator</h2>
    <form>
      <div>
        <label for="number">Number of jokes</label>
        <input type="number" id="number">
      </div>
      <div>
        <button class="get-jokes">Get Jokes</button>
      </div>
    </form>
    <div class="shape">
    <ul class="jokes"></ul>
  </div>
	</div>
<footer>

<section class=top>

    <h1>FreshDesk Next Generation Find us on</h1>
    
    <ul class="social_list">
  
      <li><a class=social_lnk-codepen data-filter=filter-ripple href=#><span>CodePen</span></a></li>
      <li><a class=social_lnk-facebook data-filter=filter-ripple href=#><span>Facebook</span></a></li>
      <li><a class=social_lnk-twitter data-filter=filter-ripple href=#><span>Twitter</span></a></li>
      <li><a class=social_lnk-googleplus data-filter=filter-ripple href=#><span>Google+</span></a></li>
      <li><a class=social_lnk-linkedin data-filter=filter-ripple href=#><span>Linked In</span></a></li>
  
    </ul>
  
  </section>
<div id="footer-bottom" align="center"> Copyright &copy;
<script>document.write(new Date().getFullYear())</script> freshdesk
</div>

</footer>

<script language="JavaScript" type="text/javascript">

document.querySelector('.get-jokes').addEventListener('click', getJokes);

function getJokes(e) {
  const number = document.querySelector('input[type="number"]').value;

  const xhr = new XMLHttpRequest();
  var url = 'http://api.icndb.com/jokes/random/' + number; 

  xhr.open('GET', url, true);

  xhr.onload = function() {
    if(this.status === 200) {
      var response = JSON.parse(this.responseText);
      
      let output = '';

      if(response.type === 'success') {
        response.value.forEach(function(joke){
          output += '<li>' + joke.joke + '</li>';
        });
    	 // output += '<li>${response.value.joke}</li>';
      } else {
        output += '<li>Something went wrong</li>';
      }

      document.querySelector('.jokes').innerHTML = output;
    }
  }

  xhr.send();

  e.preventDefault();
}
</script>
</body>
</html>
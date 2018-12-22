# Angular-5.0-and-Spring-Boot-2.0
It's basicallly a Demo App which consists of two sub apps.
 
 'DemoCarApp' : Created the app using Java 9 with Spring Boot 2.0 in backend and Angular 5.0 as frontend. Frontend gets the data using REST call. The app provides you list of few cars with their images. It gets the image from "GiphyApp : //api.giphy.com/v1/gifs/search?api_key=dc6zaTOxFJmzC&limit=1&q='{#searchtext}'" api with 'searchtext' as parameter. Also it gets the 'searchtext' from backend server which is created in Java with Spring Boot. You can perform CRUD operations too in this app.
 
 'CbseResultApp' : Created the app with same frontend and backend. In this app, we can see Cbse Region Wise Result(Mock) for class X , 2018. Created a fake server using 'JSON-Server' package of Node. This server gives mock JSON data for the app. The backend Java server consumes the JSON data from 'JSON-Server' and pass it to client created in Angular using REST.
 
 (Angular 5.0)-->(Java 9 + Spring 2.0)-->(JSON-Server)

Este fue un proyecto universitario de la materia Arquitectura y Diseño de Sistemas del año lectivo 2019
La aplicacion es una AndroidApp que busca canciones en Spotify y luego brinda la posibilidad de contactar con otros servicios web 
a modo de obtener mas informacion de la misma, por caso: letra,informacion del artista y album
La aplicacion es libre y esta completamente funcional. 
Sobre la sintaxis y estructura, esta programada en Kotlin y esta basada en el patron arquitectónico MVP
La resolucion del mismo contó de 3 etapas principales:
-En la primer parte, la aplicacion se nos entrego funcional pero con escrita en Java y con un codigo absolutamente monolitico. Entonces nuestro labor
consistió en realizar un refactor general para respetar el patron MVP y respetar todos los principios SOLID. Y por supuesto tambien, realizar la 
refactorizacion en kotlin :)
-En la segunda, todos los equipos de desarrollo fueron divididos en 3 grandes grupos. De esta manera cada equipo tuvo que implementar la conexion 
con un web service distinto dentro en funcion de que agrupacion tenia asignada. Nuestro equipo quedo en el grupo del servicio LastFM, el cual provee
informacion del artista. La tarea entonces consistió en implementar la conexion con dicho servicio utilizando el API del mismo.
-La tercera y ultima parte, la idea fue de integrar en nuestra aplicacion los restantes 2 servicios que implementaron otros equipos de otros grupos
mencionados arriba. Entonces en esta parte se hizo uso del patron arquitectónico Broker para integrar los otros 2 restantes servicios, los cuales fueron
DiscoGS y Lyrics, los cuales brindan informacion del disco de una cancion y la letra de una cancion respectivamente. 
La idea del proyecto fue la de simular un ambiente de trabajo normal. En donde los requerimientos son cambiantes, las restricciones de arquitecturas son  simples
pero firmes y en donde hay que aprender a trabajar y comunicarse en equipo.
Para mas informacion no dude en  

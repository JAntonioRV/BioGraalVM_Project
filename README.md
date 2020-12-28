# BioGraalVM_Project

## Visión
Desarrollar una herramienta que permita el manejo de secuencias de ADN por medio de herramientas de programación poliglota con GraalVM.

## Alcance
Desarrollo de una API REST con Micronaut y GraalVM con funcionalidades de secuencias ADN simples:
* Complement
* Reverse Complement

Dicha API REST se consultará por medio una aplicación Web de Angular que tenga acceso a las funcionalidades mencionadas anteriormente.

## Requerimientos
* GraalVM CE 20.3 Java 8 
	* Native Image
	* Python
	* LLVM
* Micronaut Version: 1.0.0.RC2
* SDKMAN 5.9.1+575
* Docker version 19.03.6
* GraalVM Java version 20.3.0.r8-grl

## Arquitectura 

Arquitectura del sistema

![Arquitectura del sistema](/diagrams/Arquitectura-Sistema.png)

Diagrama de clases

![Arquitectura del sistema](/diagrams/DC_MNGraalVM.jpg)

Diagrama de componentes
![Arquitectura del sistema](/diagrams/DComp_MNGraalVM.jpg)


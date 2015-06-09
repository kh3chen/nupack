javac NuPackCalculator.java
javac -cp .;junit-4.12.jar NuPackTest.java
pause
java -cp .;junit-4.12.jar;hamcrest-core-1.3.jar org.junit.runner.JUnitCore NuPackTest
pause
Aplicatie de testare cu Junit care calculeaza perimetrul unei figuri geometrice: triunghi, patrat, dreptunghi.
Pentru realizarea aplicatiei am folosit IntelliJ, build tool-ul folosit este Maven.

JUnit este un cadru de testare unitară pentru a scrie și a rula teste automate repetabile pentru Java.
In folderul source – src -> main -> java am creat pachetul com.itfactory si am adaugat interfata CalculP.
In interfata am declarat metoda: public double perimetru(). Aceasta metoda va fi suprascrisa in fiecare dintre cele 3 clase ce o implementeaza.

Pentru testarea JUnit am importat: import org.junit.Before; import org.junit.Test; import static org.junit.Assert.*;
Am declarant un obiect si in metoda @Before l-am instantiate.

Metoda public void ifIsOk verifica daca valoarea introdusa este egala cu valoarea calculate.

Metoda public void isTrue verifica daca obiectul exista.

Metoda public void isNotNull verifia daca obiectul nu este null.

Metoda public isFalse verifica daca valoarea introdusa nu este egala cu valoarea calculate.

Daca la rulare, testele sunt bifate cu verde, inseamna ca metodele au trecut testul.

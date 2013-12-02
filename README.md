Hello-World
===========

(First exercise for Java)

Projekt kompilowany z użyciem systemu operacyjnego Windows 7

Aby skompilować program HelloWorldProject po jego downloadzie na nasz dysk należy:

1)Zainstalować maszynę wirtualną JAVA i resztę komponentów pobierajajac oprogramowanie ze strony: http://www.java.com/pl/download/

2)Zainstalować MAVEN v. 3.1.1 (czyli narzędzie wspierające budowanie projektu) ze strony: http://maven.apache.org/download.cgi#Installation

W sposób następujący:

a)

-Tworzymy katalog na dysku C np: C:\Program Files\Apache Software Foundation i wypakowujemy zawartość apache-maven-3.1.1-bin.zip do niego. Zatem pełna ścieżka będzie wyglądać po wypakowaniu tak:

C:\Program Files\Apache Software Foundation\apache-maven-3.1.1


-KLIKAMY: (WINDOW_KEY)+Pause (pokazuje się okno dialogowe Windows Właściwości Komputera)

Przechodzimy do "Zaawansowane ustawienia systemu" następnie "Zmienne środowiskowe"

b) 

Ustawiamy zmienne środowiskowe dla systemu o następujących nazwach i wartościach:


Nazwa: JAVA_HOME 
Wartość: (ścieżka dostępu do jdk czyli np: C:\Program Files\Java\jdk1.7.0_13)

Nazwa: MAVEN_HOME
Wartość: (ścieżka dostępu do mavena czyli w tym przypadku: C:\Program Files\Apache Software Foundation\apache-maven-3.1.1)

c) Edytujemy zmienną środowiskową Path.

Jeżeli zmienna jest już utworzona i są przypiasne "jakieś" własności to dopisujemy:

;C:\Program Files\Java\jdk1.7.0_13;%MAVEN_HOME%\bin 

jeżeli nie ma nic przypisanego do zmiennej Path zapisujemy to samo tylko bez pierwszego średnika (;)

d) Odpalamy "START" -> cmd -> a następnie wpisujemy do konsoli: mvn --version (jeżeli się poprawnie zainstalowało to będziemy mieli informacje m.in. o wersji naszego systemu operacyjnego,wersji mavena itp.)

3) Wypakowujemy spakowany folder z aplikacją HelloWorldProject do 

C:\Program Files\Apache Software Foundation\apache-maven-3.1.1\bin

UWAGA!!!! 

Poprawnie powinno się wypakować projekt, następnie otworzyć folder Hello-World-master i dopiero kopiować HelloWorldProject do miejsca przeznaczenia.

UWAGA!!!!

4) Odpalamy "START"->cmd i następnie:

Aby kompilacja się udała musimy zmienić katalog w miejsce gdzie znajduje się nasz projekt (niesamowicie konieczne jest aby kompilator miał w swoim zakresie działania plik pom.xml.Zmieniamy katalog w nstp. sposób (w naszym przypadku):

cd C:\Program Files\Apache Software Foundation\apache-maven-3.1.1\bin

Kolejny krok to skompilowanie aplikacji. Robimy to poprzez funkcję:

mvn package

Następnie odpalamy aplikację po kompilacji:

java -cp target/HelloWorldProject-1.0-SNAPSHOT.jar com.mycompany.helloworldproject.App

Po czym pokazuje się naszym oczom przepiękne działanie aplikacji, która pisze nam na konsoli "Hello World!"

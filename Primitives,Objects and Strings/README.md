# Primitives, Objects and Strings

### Primitive vs Methods
<p> You could view primitive values as actual data, and objects as containers of data. If primitive values where atoms, objects would be molecules.

Objects and primitive values have types. There are 8 primitive types in Java:

    Integers
        byte (−128–127)
        short (±32 thousand)
        int (±2 billion)
        long (±9 quintillion)
    Reals
        float (~6 digits precision)
        double (~15 digits precision)
    char (unicode characters: a 5, ξ, ♪, …)
    boolean (true/false)

All other types (String, List, YourCustomClass, …) are reference types.
Important: Note that it's called reference types and not object types. In Java you never work with objects directly; you always work with references (“pointers”) to objects.

Key fact 1:
Objects aren't passed around at all.  </p>

Key fact 2:
Primitives and references are passed by value.

Key fact 3:
If a method modifies an object, the modification is visible outside that method.  

### Strings

In this case, "Hello world!" is a string literal—a series of characters in your code that is enclosed in double quotes. Whenever it encounters a string literal in your code, the compiler creates a String object with its value—in this case, Hello world!.
he String class is immutable, so that once it is created a String object cannot be changed. The String class has a number of methods, some of which will be discussed below, that appear to modify strings

### Print methods (Sistem.out)

Na tabela abaixo temos alguns dos especificadores de formato mais comuns empregados pelo método printf():
Especificador 	Formato
%s 	String de caracteres
%d 	Número inteiro decimal
%u 	Número inteiro decimal sem sinal
%o 	Número inteiro octal sem sinal
%x, %X 	Número inteiro hexadecimal sem sinal, minúsculo ou maiúsculo
%f 	Float
%2f 	Double
%e, %E 	Número real, em notação científica, minúsculo ou maiúsculo
%b 	Boolean
%c 	Caractere (char)

Método printf – Caracteres de escape

Abaixo temos alguns dos caracteres de escape mais comuns empregados pelo método printf() (e outros métodos):
Caractere 	Representa
\t 	Tabulação
\b 	Backspace
\n 	Nova Linha
\r 	Retorno de carro
\’ 	Aspa simples
\” 	Aspa dupla
\\ 	Barra invertida
Específico para o printf:
Caractere 	Representa
%% 	Símbolo de porcentagem

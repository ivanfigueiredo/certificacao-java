Tipo de Dados - Tipos Primitivos

<table>
  <tr>
    <th>Palavra-chave</th>
    <th>Tipo</th>
    <th>Valor Mínimo</th>
	<th>Valor máximo</th>
	<th>Valor padrão</th>
	<th>Exemplo</th>
  </tr>
  <tr>
    <td>boolean</td>
    <td>true/false</td>
    <td>n/D</td>
	<td>n/D</td>
	<td>false</td>
	<td>true</td>
  </tr>
  <tr>
    <td>byte</td>
    <td>valor integral de 8 bits</td>
    <td>-128</td>
	<td>127</td>
    <td>0</td>
    <td>123</td>
  </tr>
  <tr>
    <td>short</td>
    <td>valor integral de 16 bits</td>
    <td>-32.768</td>
	<td>32.767</td>
    <td>0</td>
    <td>123</td>
  </tr>
  <tr>
    <td>int</td>
    <td>valor integral de 32 bits</td>
    <td>-2.147.483.648</td>
	<td>2.147.483.647</td>
    <td>0</td>
    <td>123</td>
  </tr>
  <tr>
    <td>long</td>
    <td>valor integral de 64 bits</td>
    <td>-2^63</td>
	<td>2^63 - 1</td>
    <td>0L</td>
    <td>123L</td>
  </tr>
  <tr>
    <td>float</td>
    <td>valor de ponto flutuante de 32 bits</td>
    <td>n/D</td>
	<td>n/D</td>
    <td>0.0f</td>
    <td>123.45f</td>
  </tr>
  <tr>
    <td>double</td>
    <td>valor de ponto flutuante de 64 bits</td>
    <td>n/D</td>
	<td>n/D</td>
    <td>0.0</td>
    <td>123.456</td>
  </tr>
  <tr>
    <td>char</td>
    <td>Valor Unicode de 16 bits</td>
    <td>0</td>
	<td>65.535</td>
    <td>\u0000</td>
    <td>'a'</td>
  </tr>
</table>

Assinado e não assinado: short e char
Para o exame, você deve estar ciente de que shorte charestão intimamente relacionados, pois ambos são armazenados como tipos integrais com o mesmo comprimento de 16 bits. A principal diferença é que shorté signed , o que significa que divide seu intervalo entre inteiros positivos e negativos. Por outro lado, charé unsigned , o que significa que seu intervalo é estritamente positivo, incluindo 0.


double notAtStart = _1000.00;          // Não Compila </br>
double notAtEnd = 1000.00_;            // Não Compila  </br>
double notByDecimal = 1000_.00;        // Não Compila </br>
double annoyingButLegal = 1_00_0.0_0;  // Feio, mas compila  </br>
double reallyUgly = 1__________2;      // Também compila  </br>
<h1>Operadores aritméticos binários</h1>

<table>
	<tr>
		<th>Operador</th>
		<th>Exemplo</th>
		<th>Descrição</th>
	</tr>
	<tr>
		<td>Adição</td>
		<td>a + b</td>
		<td>Adiciona dois valores numéricos</td>
	</tr>
	<tr>
		<td>Subtração</td>
		<td>c - d</td>
		<td>Subtrai dois valores numéricos</td>
	</tr>
	<tr>
		<td>Multiplicação</td>
		<td>e * f</td>
		<td>Multiplica dois valores numéricos</td>
	</tr>
	<tr>
		<td>Divisão</td>
		<td>g / h</td>
		<td>Divide um valor numérico por outro</td>
	</tr>
	<tr>
		<td>Módulo</td>
		<td>i % j</td>
		<td>Retorna o resto após a divisão de um valor numérico por outro</td>
	</tr>
</table>

<h2>Regras de Promoção Numérica</h2>

<p>
	Se dois valores tiverem tipos de dados diferentes, o Java promoverá automaticamente um dos valores para o maior dos dois tipos de dados.
	Se um dos valores for integral e o outro for de ponto flutuante, o Java promoverá automaticamente o valor integral para o tipo de dados do valor de ponto flutuante.
	Tipos de dados menores, ou seja, byte, shorte char, são promovidos primeiro para intsempre que são usados ​​com um operador aritmético binário Java com uma variável (em oposição a um valor), mesmo que nenhum dos operandos seja int.
	Depois que toda a promoção tiver ocorrido e os operandos tiverem o mesmo tipo de dados, o valor resultante terá o mesmo tipo de dados que seus operandos promovidos.
</P>

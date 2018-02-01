$(function(){
   /**
	* Atribuo ao elemento #cep, o evento blur
	* Blur, dispara uma ação, quando o foco
	* sair do elemento, no nosso caso cep 
	*/
   $("#cep").blur(function(){
	   /**
		* Resgatamos o valor do campo #cep
		* usamos o replace, pra remover tudo que não for numérico,
		* com uma expressão regular
		*/
	   var cep = $(this).val().replace('.', '');
	   cep = cep.replace('-', '');
	   
	   //Verifica se não está vazio
	   if(cep !== ""){
		   
		   //Cria variável com a URL da consulta, passando o CEP
		   var url = 'https://viacep.com.br/ws/'+cep+'/json/';

		   /**
			 * Fazemos um requisição a URL, como vamos retornar json, 
			 * usamos o método $.getJSON;
			 * Que é composta pela URL, e a função que vai retorna os dados
			 * o qual passamos a variável json, para recuperar os valores
			 */
			$.getJSON(url, function(json){
				   //Atribuimos o valor aos inputs
				   $("#logradouro").val(json.logradouro);
				   $("#numero").val("");
				   $("#complemento").val("");
				   $("#bairro").val(json.bairro);
				   $("#cidade").val(json.localidade);
				   $("#estado").val(json.uf);

				   //Usamos o método fail, caso não retorne nada
			   }).fail(function(){
				   //Não retornando um valor válido, ele mostra a mensagem
				   $("#logradouro").val("");
				   $("#numero").val("");
				   $("#complemento").val("");
				   $("#bairro").val("");
				   $("#cidade").val("");
				   $("#estado").val("");
				   toastr.error("CEP incorreto ou inexistente!");
		   });
	   }
   });
});

<section id="perfil">
	<div class="col-md-6 col-xs-3 col-md-offset-3">
		<fieldset>
			<legend>Gerenciar Perfil</legend>
			<form action="edit" method="post">
				<div class="form-group">
					<label for="iLogin">Login</label>
						<input type="text" id="iLogin" class="form-control"
						 value="${usuario.login}" disabled>
				</div>
				<div class="form-group">
					<label for="iNome">Nome</label>
					<input type="text" id="iNome" name="nome" 
					class="form-control" value="${usuario.nome}" required>
				</div>
				<button type="submit" class="btn btn-block btn-warning">
				Enviar</button>
			</form>
		</fieldset>
	</div>
</section>
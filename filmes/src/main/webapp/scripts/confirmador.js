/**
 * Confirmar a exclusao de um contato
 * 
 *
 */

function confirmar(id) {
	let resposta = confirm("Confirma a exclusão deste filme?")
	if (resposta === true) {
		window.location.href = "delete?id=" + id
	}
}
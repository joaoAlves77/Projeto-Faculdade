/**
 * Validar campos obrigatorios
 * 
 *
 */

function verificar() {
	let nome = frmFilme.nome.value
	let autor = frmFilme.autor.value
	if (nome === "") {
		alert('Preencha o campo Nome')
		frmFilme.nome.focus()
		return false
	} else if (autor === "") {
		alert('Preencha o campo Autor')
		frmFilme.autor.focus()
		return false
	} else {
		document.forms["frmFilme"].submit()
	}
}
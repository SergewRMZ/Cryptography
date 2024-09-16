import Swal from 'sweetalert2';

export function mostrarAlertaError(mensaje: string) {
  Swal.fire({
    title: 'Error',
    text: mensaje,
    position: 'center',
    icon: 'error',
    timer: 3000,
    background: '#000',
    color: '#fff',
    confirmButtonText: 'Aceptar',
  });
}

export function mostrarMensaje (title: string, mensaje: string) {
  Swal.fire({
    title: title,
    text: mensaje,
    position: 'center',
    background: 'var(--color__primario)',
    color: '#fff',
    icon: 'success',
    timer: 2000
  })
}
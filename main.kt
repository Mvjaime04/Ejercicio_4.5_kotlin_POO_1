class Tiempo(hora: Int, minuto: Int, segundos: Int){

    

    private fun actualizarTiempoConSegundos(Totalsegundos: Int){

        hora = Totalsegundos / 3600
        min = (Totalsegundos % 3600) / 60
        seg = Totalsegundos % 60
    }

    }

}


fun main(){

}
package co.edu.uniquindio;

import org.junit.jupiter.api.*;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class BatallonTest {

    private static final Logger LOG = Logger.getLogger(BatallonTest.class.getName());

    // 1.
    // Validar la
    // creación de
    // los diferentes
    // tipos de
    // vehículos
    // Verificar
    // que al
    // crear objetos
    // de tipo TransporteTropas,
    // VehiculoBlindado y VehiculoApoyo,
    // sus atributos
    // generales y
    // particulares se
    // almacenen correctamente
    // y puedan
    // recuperarse mediante
    // sus funciones
    // de consulta.
    @Test
    void prueba1() {

        // String id, String modelo, int anioFabricacion, double kilometraje,
        // EstadoOperativo estadoOperativo, int capacidadSoldados
        String idMock = "VehiculoTopas1";
        String modeloMock = "SovieticoAsesino";
        int anioMock = 2026;
        double kilometrajeMock = 0;
        int capacidadMock = 500;
        EstadoOperativo estadoMock = EstadoOperativo.DISPONIBLE;

        TransporteTropas vehiculoTropas1 = new TransporteTropas(idMock, modeloMock, anioMock, kilometrajeMock,
                estadoMock, capacidadMock);

        String idReal = vehiculoTropas1.id;
        String modeloReal = vehiculoTropas1.modelo;
        int anioReal = vehiculoTropas1.anioFabricacion;
        double kilometrajeReal = vehiculoTropas1.kilometraje;
        int capacidadReal = vehiculoTropas1.getCapacidadSoldados();

        Assertions.assertEquals("VehiculoTopas1", idReal);
        Assertions.assertEquals("SovieticoAsesino", modeloReal);
        Assertions.assertEquals(2026, anioReal);
        Assertions.assertEquals(0, 0);
        Assertions.assertEquals(500, 500);

        // String id, String modelo, int anioFabricacion, double kilometraje,
        // EstadoOperativo estadoOperativo, int nivelBlindaje

        String idMock2 = "VehiculoBlindado1";
        String modeloMock2 = "SovieticoAsesino";
        int anioMock2 = 2026;
        double kilometrajeMock2 = 0;
        EstadoOperativo estadoMock2 = EstadoOperativo.DISPONIBLE;
        int blindajeMock2 = 1;

        Blindado blindado1 = new Blindado(idMock2, modeloMock2, anioMock2, kilometrajeMock2, estadoMock,
                blindajeMock2);

        String idReal2 = blindado1.id;
        String modeloReal2 = blindado1.modelo;
        int anioReal2 = blindado1.anioFabricacion;
        double kilometrajeReal2 = blindado1.kilometraje;
        double blindajeReal2 = blindado1.getNivelBlindaje();

        Assertions.assertEquals(idMock2, idReal2);
        Assertions.assertEquals(modeloMock2, modeloReal2);
        Assertions.assertEquals(anioMock2, anioReal2);
        Assertions.assertEquals(kilometrajeMock2, kilometrajeReal2);
        Assertions.assertEquals(blindajeMock2, blindajeReal2);

        String idMock3 = "VehiculoTopas1";
        String modeloMock3 = "SovieticoAsesino";
        int anioMock3 = 2026;
        double kilometrajeMock3 = 0;
        EstadoOperativo estadoMock3 = EstadoOperativo.DISPONIBLE;
        TipoFuncion tipoFuncionMock3 = TipoFuncion.COMUNICACIONES;

        Apoyo apoyo1 = new Apoyo(idMock3, modeloMock3, anioMock3, kilometrajeMock3, estadoMock3, tipoFuncionMock3);

        String idReal3 = apoyo1.id;
        String modeloReal3 = apoyo1.modelo;
        int anioReal3 = apoyo1.anioFabricacion;
        double kilometrajeReal3 = apoyo1.kilometraje;
        TipoFuncion funcionReal3 = apoyo1.getTipoFuncion();

        Assertions.assertEquals(idMock3, idReal3);
        Assertions.assertEquals(modeloMock3, modeloReal3);
        Assertions.assertEquals(anioMock3, anioReal3);
        Assertions.assertEquals(kilometrajeMock3, kilometrajeReal3);
        Assertions.assertEquals(tipoFuncionMock3, funcionReal3);
    }

    @Test
    void prueba4() {
        // Comprobar que el sistema permita consultar correctamente un vehículo
        // registrado utilizando su ID. También debe verificarse que la consulta de un
        // ID inexistente produzca el resultado definido para ese caso.

        Batallon batallonMock = new Batallon("01", "Cacique", "03", "Calarcá", 3);

        TransporteTropas transporteMock = new TransporteTropas("T-01", "Camión de tropas", 2020,
                12000, EstadoOperativo.DISPONIBLE, 25);

        batallonMock.registrarVehiculo(transporteMock);

        String idReal = batallonMock.buscarVehiculo("T-01").id;

        Assertions.assertEquals(transporteMock.id, idReal);
        Assertions.assertNull(batallonMock.buscarVehiculo("666"));

    }

    @Test
    void Prueba6() {
        // 6. Actualizar correctamente la información de un vehículo
        // Verificar que el sistema permita modificar el kilometraje y estado operativo
        // de un vehículo previamente registrado y que los nuevos valores queden
        // almacenados correctamente.

        Batallon batallonMock = new Batallon("01", "Cacique", "03", "Calarcá", 3);

        TransporteTropas transporteMock = new TransporteTropas("T-01", "Camión de tropas", 2020,
                12000, EstadoOperativo.DISPONIBLE, 25);

        batallonMock.registrarVehiculo(transporteMock);

        Vehiculo transporteReal = batallonMock.buscarVehiculo("T-01");

        transporteReal.setKilometraje(100);
        transporteReal.setEstadoOperativo(EstadoOperativo.EN_MANTENIMIENTO);

        Assertions.assertEquals(100, transporteReal.getKilometraje());
        Assertions.assertEquals(EstadoOperativo.EN_MANTENIMIENTO, transporteReal.getEstadoOperativo());
    }
}
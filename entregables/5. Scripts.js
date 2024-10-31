//
//MongoDB no utiliza scripts DDL como las bases de datos relacionales
//

// Crear colección de comentarios
db.createCollection("comentarios")

// Insertar un comentario de ejemplo
db.comentarios.insertOne({
  productoId: 1,
  clienteId: 1,
  contenido: "Excelente producto",
  fecha: new Date()
})

// Crear colección de productos relacionados
db.createCollection("productos_relacionados")

// Insertar un documento de productos relacionados de ejemplo
db.productos_relacionados.insertOne({
  productoId: 1,
  productosRelacionadosIds: [2, 3, 4]
})
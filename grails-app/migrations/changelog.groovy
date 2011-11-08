databaseChangeLog = {

	changeSet(author: "josh (generated)", id: "1320769004665-1") {
		createTable(tableName: "book") {
			column(name: "id", type: "int8") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "book_pkey")
			}

			column(name: "version", type: "int8") {
				constraints(nullable: "false")
			}

			column(name: "author", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "title", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "josh (generated)", id: "1320769004665-2") {
		createSequence(schemaName: "public", sequenceName: "hibernate_sequence")
	}
}

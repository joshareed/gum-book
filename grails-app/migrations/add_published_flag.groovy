databaseChangeLog = {

	changeSet(author: "josh (generated)", id: "1320771836293-1") {
		addColumn(tableName: "book") {
			column(name: "published", type: "bool", defaultValue: true) {
				constraints(nullable: "false")
			}
		}
	}
}

dataSource {
	pooled = true
	driverClassName = "org.postgresql.Driver"
	username = ""
	password = ""
}
hibernate {
	cache.use_second_level_cache = true
	cache.use_query_cache = true
	cache.provider_class = 'net.sf.ehcache.hibernate.EhCacheProvider'
}
// environment specific settings
environments {
	development {
		dataSource {
			dbCreate = "update" // one of 'create', 'create-drop','update'
			url = "jdbc:postgresql:gum_books_dev"
		}
	}
	test {
		dataSource {
			dbCreate = "update"
			url = "jdbc:postgresql:gum_books_test"
		}
	}
	production {
		dataSource {
			dbCreate = "update"
			url = "jdbc:postgresql:gum_books_prod"
		}
	}
}

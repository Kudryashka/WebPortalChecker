CREATE TABLE queries (
	id SERIAL PRIMARY KEY,
	query_date TIMESTAMP NOT NULL,
	query_body TEXT NOT NULL
);
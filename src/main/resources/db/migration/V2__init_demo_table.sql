CREATE TABLE IF NOT EXISTS gcp_final_task.users (
    id BIGSERIAL PRIMARY KEY,
    user_name TEXT NOT NULL,
    user_comment TEXT NOT NULL
);

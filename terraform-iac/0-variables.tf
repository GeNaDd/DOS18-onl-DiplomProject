
variable "project_id" {
  description = "ID проекта Google Cloud"
  default     = "gendevby"
}

variable "region" {
  description = "Регион Google Cloud"
  default     = "europe-west3"
}

variable "zone" {
  description = "Зона Google Cloud"
  default     = "europe-west3-b"
}

variable "machine_type" {
  description = "Тип разворачиваемых машин"
  default     = "e2-small"
}
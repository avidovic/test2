package proba.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table
data class Measurement(@Id val id: Long?, var name: String)
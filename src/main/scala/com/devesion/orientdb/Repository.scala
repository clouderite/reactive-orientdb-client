package com.devesion.orientdb

import com.orientechnologies.orient.core.record.impl.ODocument

trait Repository[T <: Entity[String]] {
  def findById(id: String): T
  def findByIdOptional(id: String): Option[T]
  def findAll(): List[T]
  def findDocumentById(id: String): ODocument
  def query(where: String): List[T]
  def save(item: T): T
  def merge(item: T): T
  def delete(item: T): T
}
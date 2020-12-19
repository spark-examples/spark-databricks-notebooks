// Databricks notebook source
// MAGIC %sh
// MAGIC pwd

// COMMAND ----------

// MAGIC %sh ls -lrt /

// COMMAND ----------

// MAGIC %sh ls -lrt /dbfs/

// COMMAND ----------

// MAGIC %sh ls -lrt /dbfs/FileStore/tables/

// COMMAND ----------

// MAGIC %fs ls /

// COMMAND ----------

// MAGIC %fs ls dbfs:/

// COMMAND ----------

// MAGIC %fs ls file:/

// COMMAND ----------

// MAGIC %fs ls /FileStore/tables/

// COMMAND ----------

// MAGIC %fs ls dbfs:/FileStore/jars/

// COMMAND ----------

dbutils.fs.help()

// COMMAND ----------

dbutils.fs.mounts

// COMMAND ----------

dbutils.fs.ls("dbfs:/")

// COMMAND ----------

dbutils.fs.ls("/")

// COMMAND ----------

dbutils.fs.ls("/FileStore/tables/")

// COMMAND ----------

// MAGIC %fs ls file:/

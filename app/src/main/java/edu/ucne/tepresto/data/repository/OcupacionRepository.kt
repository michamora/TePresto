package edu.ucne.tepresto.data.repository

import edu.ucne.tepresto.data.local.dao.OcupacionDao
import edu.ucne.tepresto.data.local.entity.OcupacionEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class OcupacionRepository @Inject constructor(
    private  val ocupacionDao: OcupacionDao
) {
    suspend fun insert(ocupacion: OcupacionEntity) {
        return ocupacionDao.insert(ocupacion)
    }
    suspend fun delete(ocupacion: OcupacionEntity) = ocupacionDao.delete(ocupacion)

    suspend fun find(ocupacionId:Int) = ocupacionDao.find(ocupacionId)

    fun getList(): Flow<List<OcupacionEntity>> = ocupacionDao.getList()
}
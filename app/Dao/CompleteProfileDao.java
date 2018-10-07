package Dao;

import Entity.CompleteProfileEntity;
import org.hibernate.engine.spi.SharedSessionContractImplementor;

public interface CompleteProfileDao {
    void saveCompleteProfileDetails(CompleteProfileEntity completeProfileEntity);

}

package Entity;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.id.IdentityGenerator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class ProfileIdGenerator implements IdentifierGenerator {

//    public Serializable generate(SessionImplementor sessionImplementor) throws HibernateException {
//
//    }

    @Override
    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) throws HibernateException {
        String prefix = "SM-";
        Connection connection = sharedSessionContractImplementor.connection();
        System.out.println("Coming here to check all matrimony IDS::::::::::::::::::;");

        try {
            Statement statement=connection.createStatement();

            ResultSet rs=statement.executeQuery("select max(id) from db_matrimony.registrationdetails");

            if(rs.next())
            {
                int id=rs.getInt(1)+12100;
                System.out.println("matrimony id is::::::::;"+id);

                String generatedId = prefix + new Integer(id).toString();
                System.out.println("Generated Id: " + generatedId);
                return generatedId;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}

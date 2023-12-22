package safetynetalerts.Service.Endpoints;

import com.safetynet.safetynetalerts.dto.PersonInfo;

import java.util.List;

public interface IPersonInfoService {
    List<PersonInfo> getPersonInfo(String firstName, String lastName);
}

package safetynetalerts.Service.Endpoints;

import com.safetynet.safetynetalerts.dto.EmailWithName;
import safetynetalerts.dto.EmailWithName;

import java.util.List;

public interface ICommunityEmailService {
    List<EmailWithName> getCommunityEmail(String city);
}

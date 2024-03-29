package safetynetalerts.controller.Endpoints;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import safetynetalerts.Service.Endpoints.CommunityEmailService;
import safetynetalerts.dto.EmailWithName;

import java.util.List;

/**
 * Controller mapping GET for CommunityEmailService and CommunityEmail endpoint
 */
@Data
@RestController
public class CommunityEmailController {

    @Autowired
    CommunityEmailService service;

    @GetMapping("/communityEmail")
    public List<EmailWithName> getCommunityEmail(@RequestParam String city) {
        return service.getCommunityEmail(city);
    }
}

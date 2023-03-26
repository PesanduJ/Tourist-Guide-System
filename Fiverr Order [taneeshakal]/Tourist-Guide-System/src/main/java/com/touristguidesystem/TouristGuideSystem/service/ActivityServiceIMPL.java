package com.touristguidesystem.TouristGuideSystem.service;

import com.touristguidesystem.TouristGuideSystem.entity.Activity;
import com.touristguidesystem.TouristGuideSystem.entity.Location;
import com.touristguidesystem.TouristGuideSystem.repo.ActivityCenterRepository;
import com.touristguidesystem.TouristGuideSystem.repo.ActivityRepository;
import com.touristguidesystem.TouristGuideSystem.repo.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityServiceIMPL implements ActivityService{

    /*
        * In Spring, the @Autowired annotation is used to automatically wire a bean into another bean when the container is creating and initializing the beans.
          It essentially enables dependency injection (DI) in your code.Here's a simple example to demonstrate the use of @Autowired:

          Suppose you have a UserService class and a UserRepository interface. You want to inject the UserRepository into the UserService using @Autowired.
          Here's what the code would look like:


                                    public interface UserRepository {
                                    // methods for CRUD operations
                                    }

                                    @Service
                                    public class UserService {

                                    @Autowired
                                    private UserRepository userRepository;

                                    // methods that use the userRepository
                                    }


                                    In this example, the UserService class has a field named userRepository that is annotated with @Autowired. When the Spring container creates an instance of UserService, it will look for a bean that implements the UserRepository interface and inject it into the userRepository field.

                                    Now let's compare this with an example without @Autowired. Here's what the code would look like:


                                    @Service
                                    public class UserService {

                                        private UserRepository userRepository;

                                        public UserService(UserRepository userRepository) {
                                            this.userRepository = userRepository;
                                        }

                                        // methods that use the userRepository
                                    }
                                    In this example, the UserService class has a constructor that takes a UserRepository parameter. When you create an instance of UserService manually, you need to pass in a UserRepository object explicitly. This approach can work well for small applications, but it can become cumbersome to manually wire up dependencies as the application grows in complexity.

                                    In summary, @Autowired is a convenient way to inject dependencies into your Spring beans automatically, without requiring explicit manual wiring.*/
    @Autowired
    private ActivityRepository activityRepository;

    @Autowired
    private ActivityCenterRepository activityCenterRepository;

    @Autowired
    private LocationRepository locationRepository;





    @Override
    public Activity addActivity(Activity activity) {
        return activityRepository.save(activity);
    }

    @Override
    public List<Activity> getActivites() {
        return activityRepository.findAll();
    }

    @Override
    public List<Activity> findByCity(String city) {
        return activityRepository.findByCity(city);
    }

    @Override
    public List<Activity> findByPriceRange(int minPrice, int maxPrice) {
        return activityRepository.findByPriceBetween(minPrice, maxPrice);
    }

    @Override
    public List<Activity> findByRates(int rates) {
        return activityRepository.findByRates(rates);
    }

    @Override
    public List<Activity> findByType(String type) {
        return activityRepository.findByType(type);
    }

}

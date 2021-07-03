package com.project.ProjectFitness.entity;

import javax.persistence.*;

@Entity
@DiscriminatorValue("admin_user")
public class Admin extends User{

}

package com.moistAbes.projectManager;

import com.moistAbes.projectManager.domain.dto.ProjectDto;
import com.moistAbes.projectManager.domain.dto.SectionDto;
import com.moistAbes.projectManager.domain.dto.TaskDto;
import com.moistAbes.projectManager.domain.dto.UserDto;
import com.moistAbes.projectManager.domain.entity.ProjectEntity;
import com.moistAbes.projectManager.domain.entity.SectionEntity;
import com.moistAbes.projectManager.domain.entity.TaskEntity;
import com.moistAbes.projectManager.domain.entity.UserEntity;
import org.springframework.scheduling.config.Task;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class TestDataUtil {

    public static UserEntity createTestUserA(){
        return UserEntity.builder()
                .name("Test user name A")
                .surname("Test user surname A")
                .projects(List.of())
                .build();
    }

    public static UserEntity createTestUserB(){
        return UserEntity.builder()
                .name("Test user name B")
                .surname("Test user surname B")
                .projects(List.of())
                .build();
    }

    public static UserEntity createTestUserC(){
        return UserEntity.builder()
                .name("Test user name C")
                .surname("Test user surname C")
                .projects(List.of())
                .build();
    }

    public static UserDto createTestUserDtoA(){
        return UserDto.builder()
                .name("Test user name A")
                .surname("Test user surname A")
                .projectsId(List.of())
                .build();
    }

    public static ProjectEntity createTestProjectA(){
        return ProjectEntity.builder()
                .id(1L)
                .title("TestProjectA")
                .build();
    }
    public static ProjectEntity createTestProjectB() {
        return ProjectEntity.builder()
                .id(2L)
                .title("TestProjectB")
                .build();
    }
    public static ProjectEntity createTestProjectC() {
        return ProjectEntity.builder()
                .id(3L)
                .title("TestProjectC")
                .build();
    }

    public static ProjectDto createTestProjectDtoA(){
        return ProjectDto.builder()
                .id(123L)
                .usersId(List.of())
                .title("Test title")
                .build();
    }

    public static TaskDto createTaskDtoA(){
        return TaskDto.builder()
                .title("TaskTitleA")
                .content("TaskContentA")
                .priority("TaskPriorityA")
                .progress("TaskProgressA")
                .startDate(LocalDate.of(1987, 5, 3))
                .endDate(LocalDate.of(1987, 5, 4))
                .projectId(123L)
                .build();
    }

    public static TaskDto createTaskDtoB(){
        return TaskDto.builder()
                .title("TaskTitleB")
                .content("TaskContentB")
                .priority("TaskPriorityB")
                .progress("TaskProgressB")
                .startDate(LocalDate.of(1987, 5, 3))
                .endDate(LocalDate.of(1987, 5, 4))
                .projectId(123L)
                .build();
    }

    public static TaskDto createTaskDtoC(){
        return TaskDto.builder()
                .title("TaskTitleC")
                .content("TaskContentC")
                .priority("TaskPriorityC")
                .progress("TaskProgressC")
                .startDate(LocalDate.of(1987, 5, 3))
                .endDate(LocalDate.of(1987, 5, 4))
                .projectId(123L)
                .build();
    }

    public static List<TaskDto> createTestTaskDtoListA(){
        return List.of(
                createTaskDtoA(),
                createTaskDtoB(),
                createTaskDtoC()
        );
    }

    public static TaskEntity createTestTaskA(ProjectEntity projectEntity, SectionEntity sectionEntity){
        return TaskEntity.builder()
                .title("TaskTestTitleA")
                .content("TaskContentA")
                .priority("TaskPriorityA")
                .progress("TaskProgressA")
                .startDate(LocalDate.of(1987, 5, 3))
                .endDate(LocalDate.of(1987, 5, 4))
                .project(projectEntity)
                .section(sectionEntity)
                .build();
    }

    public static TaskEntity createTestTaskB(ProjectEntity projectEntity, SectionEntity sectionEntity){
        return TaskEntity.builder()
                .title("TaskTestTitleB")
                .content("TaskContentB")
                .priority("TaskPriorityB")
                .progress("TaskProgressB")
                .startDate(LocalDate.of(2001, 2, 12))
                .endDate(LocalDate.of(2003, 2, 25))
                .project(projectEntity)
                .section(sectionEntity)
                .build();
    }

    public static TaskEntity createTestTaskC(ProjectEntity projectEntity, SectionEntity sectionEntity){
        return TaskEntity.builder()
                .title("TaskTestTitleC")
                .content("TaskContentC")
                .priority("TaskPriorityC")
                .progress("TaskProgressC")
                .startDate(LocalDate.of(1995, 11, 5))
                .endDate(LocalDate.of(1995, 12, 16))
                .project(projectEntity)
                .section(sectionEntity)
                .build();
    }

    public static List<TaskEntity> createTestTaskListA(ProjectEntity projectEntity, SectionEntity sectionEntity){
        return List.of(
                createTestTaskA(projectEntity, sectionEntity),
                createTestTaskB(projectEntity, sectionEntity),
                createTestTaskC(projectEntity, sectionEntity)
        );
    }

    public static TaskDto createTestTaskDtoA(Long projectId, Long sectionId){
        return TaskDto.builder()
                .title("TaskTestTitleA")
                .content("TaskContentA")
                .priority("TaskPriorityA")
                .progress("TaskProgressA")
                .startDate(LocalDate.of(1995, 11, 5))
                .endDate(LocalDate.of(1995, 12, 16))
                .projectId(projectId)
                .sectionId(sectionId)
                .build();
    }

    public static TaskDto createTestTaskDtoB(Long projectId, Long sectionId){
        return TaskDto.builder()
                .title("TaskTestTitleB")
                .content("TaskContentB")
                .priority("TaskPriorityB")
                .progress("TaskProgressB")
                .startDate(LocalDate.of(1995, 11, 5))
                .endDate(LocalDate.of(1995, 12, 16))
                .projectId(projectId)
                .sectionId(sectionId)
                .build();
    }

    public static TaskDto createTestTaskDtoC(Long projectId, Long sectionId){
        return TaskDto.builder()
                .title("TaskTestTitleC")
                .content("TaskContentC")
                .priority("TaskPriorityC")
                .progress("TaskProgressC")
                .startDate(LocalDate.of(1995, 11, 5))
                .endDate(LocalDate.of(1995, 12, 16))
                .projectId(projectId)
                .sectionId(sectionId)
                .build();
    }

    public static SectionEntity createSectionA(ProjectEntity projectEntity){
        return SectionEntity.builder()
                .name("Test section A")
                .project(projectEntity)
                .build();
    }
    public static SectionEntity createSectionB(ProjectEntity projectEntity){
        return SectionEntity.builder()
                .name("Test section B")
                .project(projectEntity)
                .build();
    }
    public static SectionEntity createSectionC(ProjectEntity projectEntity){
        return SectionEntity.builder()
                .name("Test section C")
                .project(projectEntity)
                .build();
    }

    public static SectionDto createDtoSectionA(Long projectId){
        return SectionDto.builder()
                .name("Test section A")
                .projectId(projectId)
                .build();
    }
}
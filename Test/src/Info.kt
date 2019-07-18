import java.time.LocalDateTime
import java.util.*


enum class Gender {
    MALE, FEMALE
}


data class BirthInfo(val year: Int, val month: Int, val day: Int)

data class PersonalInformation(val name: String, val dateOfBirth: BirthInfo, val age: Int, val gender: Gender)


class ID {

    companion object PersonalInfoFactory {

        fun getInfo(name: String, year: Int, month: Int, day: Int, gender: Gender): PersonalInformation {

            val birthInfo = BirthInfo(year, month, day)

            val date = LocalDateTime.now()
            val age = date.year - year

            return PersonalInformation(name,birthInfo,age,gender)

        }
    }

    fun init() {

        val info = PersonalInfoFactory.getInfo("Fish", 1991, 4, 30, Gender.MALE)

    }
}

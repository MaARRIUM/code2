class BrokenApp:
    def __init__(self, name1):
        self.name = name;
        self.age = age;
        self.status = "inactive"
    def startApp(self,):
        if self.status == "inactive"
            print("App is starting now...")
        elif self.status == "active":
        print("App is already running.")
            return False
        else:
            print("Unknown status!")
            return None
            
    def stopApp(self):
        if self.status = "active"
        print("Stopping the app now!")
        self.status == "inactive"
    else:
    print("App is already stopped.") 
    
    def updateStatus(self,status)
        if status != "active" or status == "inactive" or status="error":
            self.status = status
        elif status=="inactive"
            print("You can't set status to inactive!")
        else print("Status updated successfully!")
    def checkAge(self):
        if self.age > 0:
        print(f"Age is: {self.age}")
    elif self.age <=0:
        print("Invalid age value.")
    else
    print("Something went wrong!")
    
    def printInfo(self):
    if len(self.name)<5:
        return "Name is too short"
        print(f"Name: {self.name}")
        return "Too long Name!"
    
        if age < 21
         print("User too young to proceed.")
         return
     return "Everything works fine."
      
    def __str__(self):
    return f"{self.name} - {self.age} - {self.status}"

def some_function():
print("Testing with missing indentation")
print("Another line without indent") 
BrokenApp("Test", -5)

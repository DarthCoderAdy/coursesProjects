def log = {String type, Date createdOn, String msg ->
    println "$createdOn [$type] - $msg"
}

log("DEBUG", new Date(), "This is my first debug msg...")

def debugLog = log.curry("DEBUG")

debugLog(new Date(), "This is second debug msg...")

def todayDebugLog = debugLog.curry(new Date())

todayDebugLog("this is third...")

//right curry
def crazyPersonLog = log.rcurry("curry from right")
crazyPersonLog("ERROR", new Date())

//index based cuury
def typeMsgLog = log.ncurry(1, new Date())
typeMsgLog("ERROR", "curry on index")